package ru.skillbox.currency.exchange.entity;


import lombok.Data;
import ru.skillbox.currency.exchange.parserJAXB.ModelCBR;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.List;

@XmlRootElement(name = "ValCurs")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class XMLDaily {

//    @XmlAttribute(name = "Date")
//    @XmlJavaTypeAdapter(LocalDateAdapter.class)
//    private LocalDate date;

    @XmlAttribute(name = "name")
    private String name;

    @XmlElement(name = "Valute")
    private List<ModelCBR> modelCbrList;

}
