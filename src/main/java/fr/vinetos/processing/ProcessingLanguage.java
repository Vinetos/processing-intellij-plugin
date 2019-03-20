package fr.vinetos.processing;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class ProcessingLanguage extends Language {

    public static final ProcessingLanguage INSTANCE = new ProcessingLanguage();

    private ProcessingLanguage() {
        super("Processing");
    }
}
