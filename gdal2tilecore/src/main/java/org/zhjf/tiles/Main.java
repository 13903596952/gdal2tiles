package org.zhjf.tiles;

import org.apache.commons.cli.ParseException;
import org.zhjf.tiles.util.GeopackageUtil;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static GeopackageUtil geopackageUtil;

    public static void main(String[] args) throws ParseException {
        GDAL2Tiles gdal2tiles = new GDAL2Tiles(args);
        try {
            if (GDAL2Tiles.geopackage) {
                geopackageUtil = new GeopackageUtil();
                geopackageUtil.initGeopackage("E:\\date\\geopackage\\home.gpkg");
            }
            gdal2tiles.process();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
