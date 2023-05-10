package org.it_academy.selenium_study.onliner;

import org.it_academy.selenium_study.LinksForTestsEnum;
import org.it_academy.selenium_study.BaseTest;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class OnlinerBaseTest extends BaseTest {
    @BeforeEach
    public void openOnliner() {
        open(LinksForTestsEnum.ONLINER.getLink());
    }
}
