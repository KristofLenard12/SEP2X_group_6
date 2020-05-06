package system.views.login.playerAccount;

import system.core.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PlayerAccountController
{
  private ViewHandler vh;
  private PlayerAccountViewModel pavm;
  @FXML private Label  errorMessagePlayer;
  @FXML private TextField addGroup;
  @FXML private ListView<String> groupListPlayer;
  public void init(PlayerAccountViewModel accountPVM, ViewHandler viewHandler)
  {
    pavm= accountPVM;
    vh = viewHandler;
     groupListPlayer.setItems(pavm.getGroupList());
     errorMessagePlayer.textProperty().bind(pavm.getErrorProperty());
     addGroup.textProperty().bindBidirectional(pavm.getSearchGroupProperty());


  }
// in thismethod I take the text in the addgroup field, and call addgroup method on it to parse it into integer
  public void addGroup(ActionEvent actionEvent)
  {
    pavm.addGroup(addGroup.getText());
  }

  // This method takes the selected group and calls the joingroupAsplayer method to it, if nothing is selected then shows error.
  public void joinGroupAsPlayer(ActionEvent actionEvent)
  { if(groupListPlayer.getSelectionModel().getSelectedItems().isEmpty()){
    pavm.joinGroupAsPlayer("");
  }else
  {
    String group =  groupListPlayer.getSelectionModel().getSelectedItems().get(0);
    pavm.joinGroupAsPlayer(group);
  }
  }


// just opens the account scene
  public void backToAccount(ActionEvent actionEvent)
  {
    vh.openAccount();
  }
}
