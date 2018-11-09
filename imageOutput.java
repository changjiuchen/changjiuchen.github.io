//I couldn't get this to work in a regular java IDE, but here is the hypothetical code based from the kumo examples and examples shown in class.

import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import com.kennycason.kumo.palette.ColorPalette;
import com.kennycason.kumo.bg.Background;
import com.kennycason.kumo.bg.RectangleBackground;
import com.kennycason.kumo.bg.PixelBoundryBackground;
import com.kennycason.kumo.CollisionMode;
import com.kennycason.kumo.WordCloud;
import com.kennycason.kumo.WordFrequency;
import com.kennycason.kumo.font.scale.LinearFontScalar;
import java.awt.*;
import java.io.*;
import java.util.*;


public class imageOutput {
    public static void main( String[] args ) throws FileNotFoundException, java.io.IOException  {


        final java.util.List<WordFrequency> wordFrequencies = frequencyAnalyzer.load("Thank U Next.txt");

        final Dimension dimension = new Dimension(600, 200);
        final WordCloud wordCloud = new WordCloud(dimension, CollisionMode.PIXEL_PERFECT);
        wordCloud.setPadding(2);
        wordCloud.setBackground(new PixelBoundryBackground("diamond.png"));
        wordCloud.setBackgroundColor(new Color(0x0000F0FF, true));
        wordCloud.setFontScalar(new LinearFontScalar(4, 10));

        wordCloud.build(wordFrequencies);
        wordCloud.writeToFile("Thank U Next.png");
    }
}