package com.saucelabs.hudson;

import com.saucelabs.ci.SauceLibraryManager;
import com.saucelabs.sauceconnect.SauceConnect;
import de.schlichtherle.truezip.file.TFile;
import hudson.Plugin;
import hudson.PluginWrapper;
import hudson.model.Hudson;
import hudson.plugins.sauce_ondemand.PluginImpl;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @author Ross Rowe
 */
public class HudsonSauceLibraryManager extends SauceLibraryManager {
    /**
     * 
     * @param jarFile
     * @throws IOException
     * @throws URISyntaxException
     */
    @Override
    public void updatePluginJar(File jarFile) throws IOException, URISyntaxException {
        throw new IOException("Not supported");

    }
}
