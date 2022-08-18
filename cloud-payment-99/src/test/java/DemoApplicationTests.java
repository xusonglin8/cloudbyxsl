import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;

@SpringBootTest
class DemoApplicationTests {
    private int areaCode;
    private String prefix;
    private String lineNumber;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + areaCode;
        result = prime * result
                + ((lineNumber == null) ? 0 : lineNumber.hashCode());
        result = prime * result + ((prefix == null) ? 0 : prefix.hashCode());
        return result;
    }

    @Test
    void contextLoads() throws ParseException {
        String dt = "20220217154030";
        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyymmddhhmmss");
        Date format = simpleDateFormat.parse(dt);
        System.out.println(dt);
        System.out.println(format);
        String format1 = simpleDateFormat.format(format.getTime());
        System.out.println(format1);*/
        String date = "20151101095440";
        String reg = "(\\d{4})(\\d{2})(\\d{2})(\\d{2})(\\d{2})(\\d{2})";
        date = date.replaceAll(reg, "$1-$2-$3");
        System.out.println(date.toString());
    }


}
