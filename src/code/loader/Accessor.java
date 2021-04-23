package code.loader;

import code.entity.CmsEntity;
import code.transfer.Transferable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Accessor<T> {
    private static final String BASE_PATH = "src/resource/";
    private final CmsEntity cmsEntity;
    private final Transferable<T> transfer;

    public Accessor(CmsEntity cmsEntity) {
        this.cmsEntity = cmsEntity;
        this.transfer = cmsEntity.getTransfer();
    }


    public List<T> loadAll(){
        List<T> entities = new ArrayList<>();
        File entityDataFile = new File(BASE_PATH + cmsEntity.getFileName());
        try {
            BufferedReader entityDataReader = new BufferedReader(new FileReader(entityDataFile));
            entityDataReader.readLine();
            String entityInfo = "";
            while((entityInfo = entityDataReader.readLine()) != null) {
                String[] entityAttributes = entityInfo.split(",");
                entities.add(transfer.toObjectBy(entityAttributes));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entities;
    }
//
//public void saveAllItem(List<Item> items) {
//    try {
//        File ItemCsvFile = new File("/Users/fanchaokong/Desktop/FIT5136/BakeShop/src/resource/user.csv");
//
//        if(ItemCsvFile.exists()) {
//            ItemCsvFile.delete();
//            ItemCsvFile.createNewFile();
//        }
//        ItemCsvFile.createNewFile();
//
//        BufferedWriter itemDataWriter = new BufferedWriter(new FileWriter(ItemCsvFile, true)); // 附加
//
//        itemDataWriter.write(ITEM_CSV_TITLE);
//        for (Item item : items){
//            itemDataWriter.newLine();
//            itemDataWriter.write(transferItemObjectToData(item));
//        }
//        itemDataWriter.close();
//
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//}
    public void saveAll(List<T> entities) {
        try {
            File entityDataFile = new File(BASE_PATH + cmsEntity.getFileName());
            if (entityDataFile.exists()) {
                entityDataFile.delete();
            }
            entityDataFile.createNewFile();

            BufferedWriter entityDataWriter = new BufferedWriter(new FileWriter(entityDataFile, true));

            entityDataWriter.write(cmsEntity.getFileTitle());
            for (T entity : entities) {
                entityDataWriter.newLine();
                entityDataWriter.write(transfer.toStringBy(entity));
            }
            entityDataWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
