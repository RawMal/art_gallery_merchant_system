import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artist leonardoDaVinci;
    Artist Banksy;
    Artwork monaLisa;
    Artwork saleEnds;
    Customer customer;


    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Tate Modern");
        leonardoDaVinci = new Artist("Leonardo Da Vinci");
        Banksy = new Artist("Banksy");
        monaLisa = new Artwork("Mona Lisa", leonardoDaVinci, 10_000_000,1234);
        saleEnds = new Artwork("Sale Ends", Banksy, 12_000_000, 4321);
        gallery.addArtwork(monaLisa);
        gallery.addArtwork(saleEnds);
        customer = new Customer("Scrooge McDuck",30_000_000);
    }

    @Test
    public void galleryCanSellArt(){
        gallery.sellArtwork(customer, monaLisa);
        assertThat(gallery.artworkCount()).isEqualTo(1);
        assertThat(gallery.getTill()).isEqualTo(10_000_000);
        assertThat(customer.getWallet()).isEqualTo(20_000_000);
        assertThat(customer.getArtworkCount()).isEqualTo(1);
    }

    @Test
    public void canCalculateArtValue(){
        double result = gallery.calculateArtworkValue();
        assertThat(result).isEqualTo(22_000_000);
    }

    @Test
    public void hasName(){
        assertThat(gallery.getGalleryName("Tate Modern")).isEqualTo("Tate Modern");
    }

    @Test
    public void tillStartsAtZero(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }





}
