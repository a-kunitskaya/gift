package com.kunitskaya.data;

import com.kunitskaya.data.mapper.Mapper;
import com.kunitskaya.data.mapper.MapperFactory;
import com.kunitskaya.domain.Sweet;
import com.kunitskaya.data.entity.GiftEntity;
import com.kunitskaya.data.entity.SweetEntity;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.kunitskaya.data.FileConstants.DEFAULT_XML_STORAGE_PATH;

public class SweetsXmlRepository implements BaseRepository {

    @Override
    public List<Sweet> readSweets() {

        ArrayList<Sweet> sweets = new ArrayList<>();

        try {
            File file = new File(DEFAULT_XML_STORAGE_PATH);

            JAXBContext jc = JAXBContext.newInstance(GiftEntity.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            GiftEntity giftEntity = (GiftEntity) unmarshaller.unmarshal(file);

            ArrayList<SweetEntity> sweetEntities = giftEntity.getSweets();

            for (SweetEntity sweetEntity : sweetEntities) {
                Mapper mapper = MapperFactory.getEntityToDomainMapper(sweetEntity.getClass());
                Sweet sweet = (Sweet) mapper.map(sweetEntity);
                sweets.add(sweet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sweets;
    }
}
