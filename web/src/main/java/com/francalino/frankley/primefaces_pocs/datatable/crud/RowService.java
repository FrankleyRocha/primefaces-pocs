package com.francalino.frankley.primefaces_pocs.datatable.crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class RowService {

    private List<Row> rows;

    @PostConstruct
    public void init() {
        rows = new ArrayList<>();
        rows.add(new Row(1000, "f230fh0g3", "Bamboo Watch", "Row Description", "bamboo-watch.jpg", 65,
                "Accessories", 24, InventoryStatus.INSTOCK, 5));
        rows.add(new Row(1001, "nvklal433", "Black Watch", "Row Description", "black-watch.jpg", 72,
                "Accessories", 61, InventoryStatus.INSTOCK, 4));
        rows.add(new Row(1002, "zz21cz3c1", "Blue Band", "Row Description", "blue-band.jpg", 79,
                "Fitness", 2, InventoryStatus.LOWSTOCK, 3));
        rows.add(new Row(1003, "244wgerg2", "Blue T-Shirt", "Row Description", "blue-t-shirt.jpg", 29,
                "Clothing", 25, InventoryStatus.INSTOCK, 5));
        rows.add(new Row(1004, "h456wer53", "Bracelet", "Row Description", "bracelet.jpg", 15,
                "Accessories", 73, InventoryStatus.INSTOCK, 4));
        rows.add(new Row(1005, "av2231fwg", "Brown Purse", "Row Description", "brown-purse.jpg", 120,
                "Accessories", 0, InventoryStatus.OUTOFSTOCK, 4));
        rows.add(new Row(1006, "bib36pfvm", "Chakra Bracelet", "Row Description", "chakra-bracelet.jpg", 32,
                "Accessories", 5, InventoryStatus.LOWSTOCK, 3));
        rows.add(new Row(1007, "mbvjkgip5", "Galaxy Earrings", "Row Description", "galaxy-earrings.jpg", 34,
                "Accessories", 23, InventoryStatus.INSTOCK, 5));
        rows.add(new Row(1008, "vbb124btr", "Game Controller", "Row Description", "game-controller.jpg", 99,
                "Electronics", 2, InventoryStatus.LOWSTOCK, 4));
        rows.add(new Row(1009, "cm230f032", "Gaming Set", "Row Description", "gaming-set.jpg", 299,
                "Electronics", 63, InventoryStatus.INSTOCK, 3));
        rows.add(new Row(1010, "plb34234v", "Gold Phone Case", "Row Description", "gold-phone-case.jpg", 24,
                "Accessories", 0, InventoryStatus.OUTOFSTOCK, 4));
        rows.add(new Row(1011, "4920nnc2d", "Green Earbuds", "Row Description", "green-earbuds.jpg", 89,
                "Electronics", 23, InventoryStatus.INSTOCK, 4));
        rows.add(new Row(1012, "250vm23cc", "Green T-Shirt", "Row Description", "green-t-shirt.jpg", 49,
                "Clothing", 74, InventoryStatus.INSTOCK, 5));
        rows.add(new Row(1013, "fldsmn31b", "Grey T-Shirt", "Row Description", "grey-t-shirt.jpg", 48,
                "Clothing", 0, InventoryStatus.OUTOFSTOCK, 3));
        rows.add(new Row(1014, "waas1x2as", "Headphones", "Row Description", "headphones.jpg", 175,
                "Electronics", 8, InventoryStatus.LOWSTOCK, 5));
        rows.add(new Row(1015, "vb34btbg5", "Light Green T-Shirt", "Row Description", "light-green-t-shirt.jpg", 49,
                "Clothing", 34, InventoryStatus.INSTOCK, 4));
        rows.add(new Row(1016, "k8l6j58jl", "Lime Band", "Row Description", "lime-band.jpg", 79,
                "Fitness", 12, InventoryStatus.INSTOCK, 3));
        rows.add(new Row(1017, "v435nn85n", "Mini Speakers", "Row Description", "mini-speakers.jpg", 85,
                "Clothing", 42, InventoryStatus.INSTOCK, 4));
        rows.add(new Row(1018, "09zx9c0zc", "Painted Phone Case", "Row Description", "painted-phone-case.jpg", 56,
                "Accessories", 41, InventoryStatus.INSTOCK, 5));
        rows.add(new Row(1019, "mnb5mb2m5", "Pink Band", "Row Description", "pink-band.jpg", 79,
                "Fitness", 63, InventoryStatus.INSTOCK, 4));
        rows.add(new Row(1020, "r23fwf2w3", "Pink Purse", "Row Description", "pink-purse.jpg", 110,
                "Accessories", 0, InventoryStatus.OUTOFSTOCK, 4));
        rows.add(new Row(1021, "pxpzczo23", "Purple Band", "Row Description", "purple-band.jpg", 79,
                "Fitness", 6, InventoryStatus.LOWSTOCK, 3));
        rows.add(new Row(1022, "2c42cb5cb", "Purple Gemstone Necklace", "Row Description", "purple-gemstone-necklace.jpg", 45,
                "Accessories", 62, InventoryStatus.INSTOCK, 4));
        rows.add(new Row(1023, "5k43kkk23", "Purple T-Shirt", "Row Description", "purple-t-shirt.jpg", 49,
                "Clothing", 2, InventoryStatus.LOWSTOCK, 5));
        rows.add(new Row(1024, "lm2tny2k4", "Shoes", "Row Description", "shoes.jpg", 64,
                "Clothing", 0, InventoryStatus.INSTOCK, 4));
        rows.add(new Row(1025, "nbm5mv45n", "Sneakers", "Row Description", "sneakers.jpg", 78,
                "Clothing", 52, InventoryStatus.INSTOCK, 4));
        rows.add(new Row(1026, "zx23zc42c", "Teal T-Shirt", "Row Description", "teal-t-shirt.jpg", 49,
                "Clothing", 3, InventoryStatus.LOWSTOCK, 3));
        rows.add(new Row(1027, "acvx872gc", "Yellow Earbuds", "Row Description", "yellow-earbuds.jpg", 89,
                "Electronics", 35, InventoryStatus.INSTOCK, 3));
        rows.add(new Row(1028, "tx125ck42", "Yoga Mat", "Row Description", "yoga-mat.jpg", 20,
                "Fitness", 15, InventoryStatus.INSTOCK, 5));
        rows.add(new Row(1029, "gwuby345v", "Yoga Set", "Row Description", "yoga-set.jpg", 20,
                "Fitness", 25, InventoryStatus.INSTOCK, 8));

    }

    public List<Row> getRows() {
        return new ArrayList<>(rows);
    }

    public List<Row> getRows(int size) {

        if (size > rows.size()) {
            Random rand = new Random();

            List<Row> randomList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int randomIndex = rand.nextInt(rows.size());
                randomList.add(rows.get(randomIndex));
            }

            return randomList;
        }

        else {
            return new ArrayList<>(rows.subList(0, size));
        }

    }

    public List<Row> getClonedRows(int size) {
        List<Row> results = new ArrayList<>();
        List<Row> originals = getRows(size);
        for (Row original : originals) {
            results.add(original.clone());
        }

        // make sure to have unique codes
        for (Row row : results) {
            row.setCode(UUID.randomUUID().toString().replace("-", "").substring(0, 8));
        }

        return results;
    }
}