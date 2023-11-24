package com.mycompany.projeto_terca;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.ScrollPane;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Text titleLabel = new Text("BEM VINDO AO PORTAL COLORADO!");
        titleLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        Text textLabel = new Text("Tornar-se sócio de um clube pode oferecer uma série de benefícios e oportunidades que vão além da simples participação em eventos sociais. Ao se juntar a um clube, os membros têm a chance de construir relacionamentos significativos, participar de atividades exclusivas e contribuir para o crescimento e sucesso da comunidade.");
        textLabel.setWrappingWidth(630);
        
        Button button = new Button("SEJA SÓCIO");
        button.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Bem vindo ao meu site interativo em Java Effects!");
            alert.showAndWait();
        });
        button.setStyle("-fx-background-color: #ff0000; -fx-text-fill: white;");

        
        Text addtionalTitleLabel = new Text ("Previlégios do clube");
        addtionalTitleLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        Text additionalTextLabel = new Text("Sócios do Internacional desfrutam de acesso exclusivo a eventos VIP, incluindo encontros com jogadores, sessões de treino especiais e eventos sociais exclusivos organizados pelo clube.\n" +
"\n" +
"Os sócios têm o privilégio de receber descontos especiais na compra de produtos e merchandising do clube, permitindo-lhes exibir com orgulho as cores e o emblema do Internacional.\n" +
"\n" +
"Os sócios têm prioridade na compra de ingressos para os jogos, garantindo-lhes a oportunidade de garantir seu lugar nos eventos mais emocionantes do Internacional antes que os ingressos estejam disponíveis ao público em geral.\n" +
"\n" +
"Anualmente, os sócios recebem um kit exclusivo contendo itens personalizados, como camisas, chaveiros, e outros itens de colecionador que não estão disponíveis para compra regular.");
        additionalTextLabel.setWrappingWidth(630);
        
        
        Image image = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Escudo_do_Sport_Club_Internacional.svg/900px-Escudo_do_Sport_Club_Internacional.svg.png");
        ImageView imageView = new ImageView(image);
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(image.getHeight() * 0.2);
        imageView.setFitWidth(image.getWidth() * 0.2);
        
     
   Text apiTitleLabel = new Text("Confira as fotografias realizadas por nosso fotógrafo colorado!");
apiTitleLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 20));

ImageView apiImageView = new ImageView();

Button apiButton = new Button("Carregar imagem da API");
apiButton.setOnAction(e -> {
    String imageUrl = "https://picsum.photos/200/300";
    Image apiImage = new Image(imageUrl);
    apiImageView.setImage(apiImage);
    apiButton.setStyle("-fx-background-color: #ff0000; -fx-text-fill: white;");
});

VBox vbox = new VBox(titleLabel, textLabel, button, addtionalTitleLabel, additionalTextLabel, imageView, apiTitleLabel, apiButton, apiImageView);
vbox.setAlignment(Pos.CENTER);
vbox.setSpacing(20);

ScrollPane scrollPane = new ScrollPane(vbox);
scrollPane.setFitToWidth(true);
scrollPane.setStyle("-fx-background-color: #ccc;");

scene = new Scene(scrollPane, 640, 480);
stage.setScene(scene);
stage.show();

// ...

    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
