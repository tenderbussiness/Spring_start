package org.test.springTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Autopark
{


    private final Auto auto;
    private List<Auto> autos;
@Autowired
    public Autopark(List<Auto> autos, Auto auto) {
        this.autos = autos;
    this.auto = auto;
}

    @Override
    public String toString() {
        return "Autopark{" +
                "autos=" + autos +
                '}';
    }


}

