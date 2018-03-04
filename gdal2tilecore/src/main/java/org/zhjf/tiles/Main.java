package org.zhjf.tiles;

import org.apache.commons.cli.ParseException;
import org.zhjf.tiles.util.GeopackageUtil;

import java.io.IOException;

public class Main {
    private static GeopackageUtil geopackageUtil;

    public static void main(String[] args) throws ParseException {
        GDAL2Tiles gdal2tiles = new GDAL2Tiles(args);
        try {
            //geopackageUtil = new GeopackageUtil();
            //geopackageUtil.initGeopackage();

            gdal2tiles.process();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
