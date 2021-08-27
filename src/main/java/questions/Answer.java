package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.SearchCoursePage;

public class Answer implements Question<Boolean>
{
    private String question;

    public Answer(String question)
    {
        this.question=question;
    }

    public static Answer tothe(String question)
    {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor)
    {
        boolean Result;
        String nameCourse= Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if (question.equals(nameCourse))
        {
            Result=true;
        }
        else
        {
            Result=false;
        }
        return Result;
    }

}
