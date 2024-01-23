package steps;

import api.K6Api;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Steps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class K6Steps {
    Actor user = Actor.named("User");
    String contentType;
    private static final Logger logger = LogManager.getLogger(K6Steps.class);


    @Steps
    K6Api k6Api;

    @Given("content-type and baseURI are already acquired")
    public void contenttype_and_baseURI_are_already_acquired() {
        contentType = "application/json";
    }

    @When("User see all {string} list")
    public void actor_see_all_crocodiles_list(String endpoint) {
        user.whoCan(CallAnApi.at(k6Api.invoke_my_webservice()));
        user.attemptsTo(Get.resource(endpoint).with(request -> request.header("Content-type", contentType)));
    }

    @Then("User see response has {int} status code")
    public void actor_see_response_status_code(int code) {

        user.should(
                seeThatResponse("response for endpoint should return",
                        response -> response.statusCode(code))
        );
    }
}

