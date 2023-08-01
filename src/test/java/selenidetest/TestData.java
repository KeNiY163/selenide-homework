package selenidetest;

public class TestData {

    public String jUnitText = "@ExtendWith({SoftAssertsExtension.class})\n"
            + "class Tests {\n"
            + "  @Test\n"
            + "  void test() {\n"
            + "    Configuration.assertionMode = SOFT;\n"
            + "    open(\"page.html\");\n"
            + "\n"
            + "    $(\"#first\").should(visible).click();\n"
            + "    $(\"#second\").should(visible).click();\n"
            + "  }\n"
            + "}";


}
