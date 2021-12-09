/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sports.complex.registration.employees;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import Database.DbQuery;
import Classes.Coach;
import java.util.ArrayList;

/**
 * FXML Controller class
 *
 * @author Hamna Rauf
 */
public class AllCoachesController implements Initializable {

    @FXML
    private TableView<Coach> tableView;
    @FXML
    private TableColumn<Coach, String> idCol;
    @FXML
    private TableColumn<Coach, String> fnameCol;
    @FXML
    private TableColumn<Coach, String> lnameCol;
    @FXML
    private TableColumn<Coach, String> cnicCol;
    @FXML
    private TableColumn<Coach, String> genderCol;
    @FXML
    private TableColumn<Coach, Date> dobCol;
    @FXML
    private TableColumn<Coach, String> contactCol;
    @FXML
    private TableColumn<Coach, String> emailCol;
    @FXML
    private TableColumn<Coach, String> domainCol;

    ObservableList<Coach> list = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initCol();
        loadData();
    }

    public void initCol() {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        fnameCol.setCellValueFactory(new PropertyValueFactory<>("fname"));
        lnameCol.setCellValueFactory(new PropertyValueFactory<>("lname"));
        cnicCol.setCellValueFactory(new PropertyValueFactory<>("cnic"));
        genderCol.setCellValueFactory(new PropertyValueFactory<>("gender"));
        dobCol.setCellValueFactory(new PropertyValueFactory<>("dob"));
        contactCol.setCellValueFactory(new PropertyValueFactory<>("contact"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        domainCol.setCellValueFactory(new PropertyValueFactory<>("domain"));

    }

    public void loadData() {
        ArrayList<Coach> allCoaches = new ArrayList<Coach>();
        for (Coach coach : allCoaches) {
            list.add(coach);
        }
        tableView.setItems(list);
    }

}