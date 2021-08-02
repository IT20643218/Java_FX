package controller;

import TM.CustomerTM;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TableFormController extends Application {

    public TableView<CustomerTM> tblCustomer;
    public TextField txtID;
    public TextField txtname;
    public TextField txtAddress;
    public TextField txtcontect;

    public  void initialize(){

        lordTable();

        tblCustomer.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
        tblCustomer.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblCustomer.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("address"));
        tblCustomer.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("contact"));

        tblCustomer.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<CustomerTM>() {
            @Override
            public void changed(ObservableValue<? extends CustomerTM> observable, CustomerTM oldValue, CustomerTM newValue) {//anonimous inner class

                final CustomerTM selectedCustomer = tblCustomer.getSelectionModel().getSelectedItem();

                txtID.setText(selectedCustomer.getId());
                txtname.setText(selectedCustomer.getName());
                txtAddress.setText(selectedCustomer.getAddress());
                txtcontect.setText(selectedCustomer.getContact());
            }
        });

    }

    public void lordTable(){
        final ObservableList<CustomerTM> customerList = tblCustomer.getItems();

        CustomerTM Kumara = new CustomerTM("001","Kumara","Galgamuwa","0767078124");
        CustomerTM Nimal  = new CustomerTM("002","Nimal","Colombo","0717078124");
        CustomerTM Sunil = new CustomerTM("003","Sunil","Kandy","0707078124");
        CustomerTM Sunimal = new CustomerTM("004","Sunimal","Jaffna","0757078124");

        customerList.add(Kumara);
        customerList.add(Nimal);
        customerList.add(Sunil);
        customerList.add(Sunimal);

        tblCustomer.refresh();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    public void btnAddtoTableOnAction(ActionEvent actionEvent) {
       String id = txtID.getText();
       String name = txtname.getText();
       String address =  txtAddress.getText();
       String contact = txtcontect.getText();

        final ObservableList<CustomerTM> customerlist = tblCustomer.getItems();

        CustomerTM customer = new CustomerTM(id,name,address,contact);

        customerlist.add(customer);

        tblCustomer.refresh();

        txtID.clear();
        txtname.clear();
        txtAddress.clear();
        txtcontect.clear();

        txtID.requestFocus();


    }
}
