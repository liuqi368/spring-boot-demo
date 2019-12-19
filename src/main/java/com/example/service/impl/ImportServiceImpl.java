package com.example.service.impl;

import com.example.dao.ImportDao;
import com.example.service.ImportService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author liuqi
 * @Title: ImportServiceImpl
 * @ProjectName spring-boot-demo
 * @Description: TODO
 * @date 2018/12/317:40
 */
@Service
public class ImportServiceImpl implements ImportService{
    private static final Logger logger = LoggerFactory.getLogger(ImportServiceImpl.class);

    @Resource
    private ImportDao importDao;

    private final String excel2003 =".xls";     //2003- 版本的excel
    private final String excel2007 =".xlsx";    //2007+ 版本的excel

    /**
     * 根据文件后缀，获取对应的Workbook对象
     * @param inputStream
     * @param fileName
     * @return
     */
    private Workbook getWorkbook(InputStream inputStream, String fileName) throws IOException {
        Workbook workbook;
        String ext = fileName.substring(fileName.lastIndexOf("."));
        if(excel2003.equalsIgnoreCase(ext))
            workbook = new HSSFWorkbook(inputStream);
        else if(excel2007.equalsIgnoreCase(ext))
            workbook = new XSSFWorkbook(inputStream);
        else
            throw new RuntimeException("文件类型错误");
        return workbook;
    }

    /**
     * 格式化表格中的数值类型
     * @param cell
     * @return
     */
    public static Object getCellValue(Cell cell) {
        Object value = null;
        DecimalFormat df = new DecimalFormat(); // 格式化number String字符
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 日期格式化
        DecimalFormat df2 = new DecimalFormat(); // 格式化数字
        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_STRING:
                value = cell.getRichStringCellValue().getString();
                break;
            case Cell.CELL_TYPE_NUMERIC:
                if ("General".equals(cell.getCellStyle().getDataFormatString())) {
                    value = df.format(cell.getNumericCellValue());
                } else if ("m/d/yy".equals(cell.getCellStyle().getDataFormatString())) {
                    value = sdf.format(cell.getDateCellValue());
                } else {
                    value = df2.format(cell.getNumericCellValue());
                }
                break;
            case Cell.CELL_TYPE_BOOLEAN:
                value = cell.getBooleanCellValue();
                break;
            case Cell.CELL_TYPE_BLANK:
                value = "";
                break;
            default:
                break;
        }
        return value;
    }

    @Override
    public void uploadExcel() throws IOException {

    }
}
