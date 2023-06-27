import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// KRISTJAN PEEDISSON
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Toode {
    private int id;
    private String nimi;
    private double hind;
    private boolean aktiivne;
}
