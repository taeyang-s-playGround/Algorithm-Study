package algo.algorithm

fun main() {

    val nodes = listOf(
        Node(
            1L, "프로젝트 관리", false, false,
            children = listOf(
                Node(
                    2L, "프로젝트-2023", false, false,
                    children = listOf(
                        Node(3L, "상반기 보고서.pdf", true, false),
                        Node(
                            4L, "첨부파일", false, false,
                            children = listOf(
                                Node(5L, "이미지1.png", true, false),
                                Node(7L, "프로젝트 로고.png", true, false),
                            )
                        ),
                    )
                )
            )
        ),
        Node(
            6L, "사용자 관리", false, false,
            children = listOf(
                Node(
                    8L, "사용자-2023", false, false,
                    children = listOf(
                        Node(9L, "사용자 프로젝트 등록 현황.pdf", true, true),
                        Node(
                            10L, "첨부파일", false, true,
                            children = listOf(
                                Node(11L, "이미지1.png", true, false),
                                Node(12L, "프로젝트 로고.png", true, false),
                            )
                        ),
                    )
                )
            )
        )
    )

    class Solution {
        fun solution(nodes: List<Node>, keyword: String) {
            fun dfs(node: Node): Int {
                if (node.hidden) return 0  // 숨겨진 디렉토리면 그냥 탐색 안 함

                var count = 0
                for (child in node.children) {
                    if (child.hidden) continue

                    var childCount = 0
                    if (!child.isFile) {
                        // 디렉토리인 경우, 먼저 이름에 keyword가 있는지 확인
                        childCount = dfs(child)
                        if (keyword in child.name) {
                            childCount += 1
                        }
                    } else {
                        // 파일인 경우 이름에 keyword가 있는지 확인
                        if (keyword in child.name) childCount = 1
                    }

                    count += childCount
                }

                println("[" + node.key + "-" + node.name + "]: " + count)

                return count
            }

            for (node in nodes) {
                dfs(node)
            }
        }
    }


    val sol = Solution()
    sol.solution(nodes, "프")
}

/*

자기자신을 제외, 숨겨진 파일을 제외한
하위 디렉토리와 파일의 이름에 주어진 키워드를 포함하는 개수를 구하는 함수를 작성하시오
- 숨겨진 디렉토리는 카운트되지 않는다.
- 숨겨진 파일은 탐색하지 않는다.
-
 */