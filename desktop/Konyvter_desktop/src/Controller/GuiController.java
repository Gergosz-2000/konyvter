package Controller;

import Model.RESTModel;
import Model.ViewModel;
import View.confirmDeleteFrame;
import View.confirmNotProblematicFrame;
import View.mainFrame;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GuiController {

    private mainFrame mainFrm;
    private confirmDeleteFrame deleteFrm;
    private confirmNotProblematicFrame problemFrm;
    private RESTModel restMdl;
    private ViewModel viewMdl;
    private Vector<Vector<Object>> tableData;
    private RESTController restCtr;
    
    public GuiController(RESTController restCtr) {
        
        this.restCtr = restCtr;
        viewMdl = new ViewModel();
        initFrames();
        ActionListeners();
        getLoginStatus();
        ThreadStarter();
    }
    private void ActionListeners() {
        mainFrm.getSearchBtn().addActionListener( event -> { search(); } );
        mainFrm.getDeleteBtn().addActionListener( event -> { initConfirmDeleteFrame(); } );
        mainFrm.getValidBtn().addActionListener( event -> { initConfirmProblematicFrame(); } );
        mainFrm.getExitBtn().addActionListener( event -> { exit(); });
        mainFrm.getTableTb().addChangeListener(event -> {initTables(); });
        
        deleteFrm.getConfirmBtn().addActionListener( event -> { delete(); } );
        deleteFrm.getCancelBtn().addActionListener( event -> { disposeConfrimDeleteFrame(); } );
        
        problemFrm.getConfirmBtn().addActionListener( event -> { validAdvertisment(); } );
        problemFrm.getCancelBtn().addActionListener( event -> { disposeConfirmProblematicFrame(); } );
    }
    private void initFrames() {
        initMainFrameProperties();
        
        deleteFrm = new confirmDeleteFrame();
        problemFrm = new confirmNotProblematicFrame();

        initTables();
    }
    private void initMainFrameProperties() {
        mainFrm = new mainFrame();
        mainFrm.setTitle("Könyvtér asztali alkalmazás");
        mainFrm.setLocationRelativeTo(null);
        mainFrm.setVisible(true);
    }
    private void initConfirmDeleteFrame() {
        deleteFrm.setLocationRelativeTo(mainFrm);
        deleteFrm.setQuestionLbl("Biztosan törli a kiválasztott elemet?");
        deleteFrm.setVisible(true);
        deleteFrm.setAlwaysOnTop(true);
    }
    private void disposeConfrimDeleteFrame() {
        deleteFrm.dispose();
    }
    private void initConfirmProblematicFrame() {
        problemFrm.setLocationRelativeTo(mainFrm);
        problemFrm.setQuestionLbl("Biztosan nincsen probléma a hirdetéssel?");
        problemFrm.setVisible(true);
        problemFrm.setAlwaysOnTop(true);
    }
    private void disposeConfirmProblematicFrame() {
        problemFrm.dispose();
    }
    private void initTables() {
    
        Vector<String> columnNames = new Vector<>();
        tableData = new Vector<>();
        
        if(mainFrm.getTableTb().getSelectedIndex() == 0) {
                columnNames = viewMdl.getUserColumnNames();
                tableData = restCtr.getUsers();
                TableModel tableMdl = new DefaultTableModel(tableData, columnNames);
                mainFrm.getUserTbl().setModel(tableMdl);
        }else {
                columnNames = viewMdl.getAdvertismentColumnNames();
                tableData = restCtr.getAdvertisments();
                TableModel tableMdl = new DefaultTableModel(tableData, columnNames);
                mainFrm.getAdvertismentTbl().setModel(tableMdl);
        }   
    }
    private void ThreadStarter() {
        new Thread(runner).start();
    }
    private void search() {
        int openTab = mainFrm.getTableTb().getSelectedIndex();
        String search_text = mainFrm.getSearchTf().getText();
        if(openTab == 0) {
            restCtr.setSearchData(search_text);
            initTables();
        }else {
            restCtr.setSearchData(search_text);
            initTables();
        }
    }
    private void exit() {
        restCtr.Logout();
        System.exit(0);
    }
    private void delete() {
        clearStatusLbl();
        
        int openTab = mainFrm.getTableTb().getSelectedIndex();
        if(openTab == 0) {
            deleteUser();
        }else {
            deleteAdvertisment();
        }
        deleteFrm.dispose();
    }
    private void deleteUser() {
        int row = mainFrm.getUserTbl().getSelectedRow();
        String value = mainFrm.getUserTbl().getModel().getValueAt(row, 3).toString();
        restCtr.setId(value);
        
        restCtr.DeleteUser();
        mainFrm.setStatusLbl(restCtr.getDeleteUserMessage());
        
        initTables();
    }
    private void deleteAdvertisment() {
        int row = mainFrm.getAdvertismentTbl().getSelectedRow();
        String value = mainFrm.getAdvertismentTbl().getModel().getValueAt(row, 3).toString();
        restCtr.setId(value);
        
        restCtr.DeleteAdvertisment();
        mainFrm.setStatusLbl(restCtr.getDeleteAdvertismentMessage());
        
        initTables();
    }
    private void validAdvertisment() {
        int row = mainFrm.getAdvertismentTbl().getSelectedRow();
        String value = mainFrm.getAdvertismentTbl().getModel().getValueAt(row, 3).toString();
        restCtr.setId(value);
        
        restCtr.ValidAdvertisment();
        mainFrm.setStatusLbl(restCtr.getValidAdvertismentMessage());
        
        disposeConfirmProblematicFrame();
        
        initTables();
    }
    private void getLoginStatus() {
        String message = restCtr.getLoginMessage();
        if(restCtr.getLoginMessage() != null) {
            mainFrm.setStatusLbl(restCtr.getLoginMessage());
        }else {
            mainFrm.setStatusLbl("Nincs kapcsolat a kiszolgálóval!");
        }
    }
    private void clearStatusLbl() {
        mainFrm.setStatusLbl("");
    }
    
    Runnable runner = () -> {
        timer();
    };
    private void timer() {
        boolean time = true;
        while(time) {
               initTables();
               try {
                Thread.sleep(30000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
