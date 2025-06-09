package algo.algorithm;

import java.util.*;
import java.util.stream.Collectors;

//내 의도 :
// 접근제어자를 붙이지 않고 사용하여 package-private으로 설정합. 이로 인해 캡슐화 안했고 getter도 안씀
//inner 클래스는 static을 붙여야함. 붙이지 않으면 상위 클래스에 의존적이게 됨 하지만 붙여줌으로서 바깥 클래스 인스턴스 없이 사용 할 수 있게 됨
// 코드 예시 보고 붙여 넣은 후 작업을 시작했어

// 좀 더 확장성있게 변경하는게 어떨까
//매개변수로 "KR" 넣어주고
//    막 글케

//주어진 코드를 base로 코드를 작성했습니다. <- 이거 넣어주기

public class Programming2 {

    static class CodeGroup {
        String codeId;
        List<Code> codes;

        public CodeGroup(String codeId, List<Code> codes) {
            this.codeId = codeId;
            this.codes = codes;
        }

        public static class Code {
            String value;
            List<CodeLabel> labels;

            public Code(String value, List<CodeLabel> labels) {
                this.value = value;
                this.labels = labels;
            }
        }

        public static class CodeLabel {
            String language;
            String label;

            public String getLanguage() {
                return language;
            }
            public String getLabel() {
                return label;
            }

            public CodeLabel(String language, String label) {
                this.language = language;
                this.label = label;
            }
        }
    }


    public static Map<String, String> getLabelsForCountryKR(String countryName, List<CodeGroup> codeGroups) {
        return codeGroups.stream()
            .filter(cg -> "COUNTRY".equals(cg.codeId)) // codeId가 COUNTRY인 것만
            .flatMap(cg -> cg.codes.stream())
            .filter(code -> countryName.equals(code.value)) // countryName과 value가 같은 것만
            .flatMap(code -> code.labels.stream())
            .collect(Collectors.toMap(
                CodeGroup.CodeLabel::getLanguage,
                CodeGroup.CodeLabel::getLabel
            ));
    }

    public static void main(String[] args) {

        final List<CodeGroup> codeGroups = List.of(
            new CodeGroup("COUNTRY",
                List.of(new CodeGroup.Code("KR", List.of(new CodeGroup.CodeLabel("ko", "한국"), new CodeGroup.CodeLabel("en", "Republic of korea"))),
                    new CodeGroup.Code("CN", List.of(new CodeGroup.CodeLabel("ko", "한국"), new CodeGroup.CodeLabel("en", "China"))),
                    new CodeGroup.Code("DK", List.of(new CodeGroup.CodeLabel("ko", "덴마크"), new CodeGroup.CodeLabel("en", "Denmark"))),
                    new CodeGroup.Code("US", List.of(new CodeGroup.CodeLabel("ko", "미"), new CodeGroup.CodeLabel("en", "United States")))
                )));

        Map<String, String> result = getLabelsForCountryKR("KR", codeGroups);
        System.out.println(result);
    }
}
