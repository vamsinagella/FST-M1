
package Project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;


@Provider("UserProvider")
@PactFolder("targets/pacts")
public class ProviderTest {
  @BeforeEach
  public void setUp(PactVerificationContext context) {
	  HttpTestTarget target = new HttpTestTarget("localhost", 8585);
	  context.setTarget(target);
	 
  }
	@TestTemplate
	@ExtendWith(PactVerificationInvocationContextProvider.class)
	public void providerTest(PactVerificationContext context){
		context.verifyInteraction();
	}
	@State("Post Request")
	public void state1() {}

}
