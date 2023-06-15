package HW6_12_06_2023.work2_kor;


// Принцип разделения интерфейса
// Модули высокого уровня не должны зависеть от модулей нижнего уровня.
// И те, и другие должны зависеть от абстракций.
// Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.
public class AccountReportGenerator implements ReportGenerator, ReportGenerator1 {

    @Override
    public String generateXml() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String generateJson() {
        String report = "";
        // todo Logic
        return report;
    }
}
