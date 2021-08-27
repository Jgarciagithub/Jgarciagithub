package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.ChoucairLoginPage;

public class Login implements Task {
    private String strUser;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    private String strPassword;

    public static Login OnthePage(String strUser, String strPassword){
        return Tasks.instrumented(Login.class,strUser,strPassword);
    }
   @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON)
                , Enter.theValue(strUser).into(ChoucairLoginPage.INPUT_USER)
                , Enter.theValue(strPassword).into(ChoucairLoginPage.INPUT_PASSWORD)
                ,Click.on(ChoucairLoginPage.ENTER_BUTTON));

    }
    // public static Performable OnthePage() {
    //}
}
