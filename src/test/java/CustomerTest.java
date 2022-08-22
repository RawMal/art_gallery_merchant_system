import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {
    Customer customer;
    Artist leonardoDavinci;
    Artwork monaLisa;
    Artist rembrandt;
    Artwork nightWatch;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Scrooge McDuck", 23_000);

        leonardoDavinci = new Artist("Leonardo DaVinci");
        monaLisa = new Artwork("Mona Lisa", leonardoDavinci, 1_000, 846);

        rembrandt = new Artist("Rembrandt");
        nightWatch = new Artwork("The Night Watch", rembrandt, 50_000_000, 885);
    }

    @Test
    public void canAffordArtwork__true(){
        assertThat(customer.canBuy(monaLisa)).isEqualTo(true);
    }

    @Test
    public void canAffordArtwork__false(){
        assertThat(customer.canBuy(nightWatch)).isEqualTo(false);
    }

    @Test
    public void customerArtworkCountStartsEmpty(){
        assertThat(customer.getArtworkCount()).isEqualTo(0);
    }

    @Test
    public void canBuyArtwork(){
        customer.buyArtwork(monaLisa);
        assertThat(customer.getWallet()).isEqualTo(22_000);
        assertThat(customer.getArtworkCount()).isEqualTo(1);
    }

    @Test
    public void hasName(){
        assertThat(customer.getCustomerName()).isEqualTo("Scrooge McDuck");
    }

    @Test
    public void hasWallet(){
        assertThat(customer.getWallet()).isEqualTo(23_000);
    }
}
