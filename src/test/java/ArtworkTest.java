import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtworkTest {

    Artist artist;
    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Banksy");
        artwork = new Artwork("Choose Your Weapon", artist, 140_000,123);
    }

    @Test
    public void hasTitle()
    {AssertionsForClassTypes.assertThat(artwork.getTitle()).isEqualTo("Choose Your Weapon");}

    @Test
    public void hasArtist(){AssertionsForClassTypes.assertThat(artwork.getArtist()).isEqualTo(artist);}

    @Test
    public void hasPrice(){AssertionsForClassTypes.assertThat(artwork.getPrice()).isEqualTo(140_000);}

    @Test
    public void hasNft(){AssertionsForClassTypes.assertThat(artwork.getNft()).isEqualTo(123);}
}
