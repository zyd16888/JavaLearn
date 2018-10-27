package phone;

import people.Person;
import phone.Phone;

/**
 * 描述:
 * 19.4
 *
 * @author dong
 * @date 2018-10-27 16:59
 */
public class MobilePhone extends Phone {
    private Person owner;

    public MobilePhone(String brand, String code) {
        super(brand, code);
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public void print() {
        System.out.println("手机号码："+getCode());
    }
}
