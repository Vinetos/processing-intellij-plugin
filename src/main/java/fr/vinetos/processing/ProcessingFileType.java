package fr.vinetos.processing;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ProcessingFileType extends LanguageFileType {

    public static final ProcessingFileType INSTANCE = new ProcessingFileType();

    /**
     * Creates a language file type for the specified language.
     */
    private ProcessingFileType() {
        super(ProcessingLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Processing File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Processing language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "pde";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ProcessingIcons.FILE;
    }
}
