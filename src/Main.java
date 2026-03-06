import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    private static final int XX = 1080;
    private static final int YY = 720;
    private Canvas canvas;

    @Override
    public void start(Stage stage) {
        canvas = new Canvas(XX, YY);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, XX, YY, Color.BLACK); // ← háttérszín a Scene-en

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                render(gc);
            }
        };
        timer.start();

        stage.setTitle("Business Scheduler Main Window");
        stage.setScene(scene);
        stage.show();
    }

    private void render(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, XX, YY);
    }

    public static void main(String[] args) {
        launch(args);
    }
}