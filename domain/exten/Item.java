package domain.exten;

import javax.persistence.*;

/**
 * Created by parkey19 on 2020/01/21.
 */
@Entity
@Table(name = "ITEMS")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn
public class Item {

    @Id @GeneratedValue
    public Long id;

    public String name;

    public int price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
