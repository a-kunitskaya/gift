import com.kunitskaya.data.BaseRepository;
import com.kunitskaya.data.SweetsXmlRepository;
import com.kunitskaya.domain.Gift;
import com.kunitskaya.domain.Sweet;
import com.kunitskaya.domain.SweetCountryOfOrigin;
import com.kunitskaya.domain.PreparedSweetFactory;
import com.kunitskaya.domain.candy.CaramelCandy;
import com.kunitskaya.domain.candy.ChocolateCandy;
import com.kunitskaya.domain.chocolate.DarkChocolate;
import com.kunitskaya.domain.chocolate.MilkChocolate;
import com.kunitskaya.domain.marmalade.Marmalade;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sweet caramelCandy = PreparedSweetFactory.getPreparedSweet(CaramelCandy.class);
        Sweet chocolateCandy = PreparedSweetFactory.getPreparedSweet(ChocolateCandy.class);
        Sweet darkChocolate = PreparedSweetFactory.getPreparedSweet(DarkChocolate.class);
        Sweet milkChocolate = PreparedSweetFactory.getPreparedSweet(MilkChocolate.class);
        Sweet marmalade = PreparedSweetFactory.getPreparedSweet(Marmalade.class);

        Gift gift = new Gift();
        gift.putSweets(caramelCandy, chocolateCandy, darkChocolate, milkChocolate, marmalade);

        double giftWeight = gift.getWeight();

        List sortedSweets = gift.getSweetsSorted();

        Sweet sweetWithParameters = gift.getSweetWithParameters(30, 60, SweetCountryOfOrigin.BELGIUM);

        List<Sweet> sweetsFromXMLStorage;
        BaseRepository repo = new SweetsXmlRepository();
        sweetsFromXMLStorage = repo.readSweets();

        for (Sweet sweet : sweetsFromXMLStorage) {
            System.out.println(sweet.toString());
        }
    }
}
