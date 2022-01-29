package np.qa.lesson10.pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(Integer year,String month, Integer day){
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").find(byText(month)).click();
        $(".react-datepicker__year-select").click();
        $("[value='"+year.toString()+"']").click();

        String dayString=day.toString();

        if (dayString.length()==1){
            dayString="0"+dayString;
        }

        $(".react-datepicker__day--0"+dayString
                +":not(.react-datepicker__day--outside-month)").click();
    }
}
