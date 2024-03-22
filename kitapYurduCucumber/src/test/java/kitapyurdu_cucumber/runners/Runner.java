package kitapyurdu_cucumber.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", //console renkli yazdirmak icin
                "html:target/default-cucumber-reports.html"

        },
        monochrome = true,//Raporların consolda okunaklı olması
        features = "src/test/resources/features",//features folder path
        glue = {"kitapyurdu_cucumber/stepdefinations","hooks"},
        tags = "@yemek",
        dryRun = true
)





public class Runner {

}
