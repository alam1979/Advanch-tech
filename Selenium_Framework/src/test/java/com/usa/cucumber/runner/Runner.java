package com.usa.cucumber.runner;

        import org.junit.runner.RunWith;
        import cucumber.api.CucumberOptions;
        import cucumber.api.SnippetType;
        import cucumber.api.junit.Cucumber;
        
        @RunWith(Cucumber.class)
        @CucumberOptions(
		plugin= {"pretty","html:target/cucumber", "json:target/cucumber.json"},
		snippets=SnippetType.CAMELCASE,
		strict=true,
		monochrome = true,
		//dryRun=true,
		features= {"src/main/resources/Features/LoginSenario.feature",
	    //"src/main/resources/Features/Login02.feature"
		},
		glue= {"com.usa.ttech.student.stepdefination"},
		//features = "src/main/resources/Features",
		tags= {"@login"}
		)
        public class Runner {   }
