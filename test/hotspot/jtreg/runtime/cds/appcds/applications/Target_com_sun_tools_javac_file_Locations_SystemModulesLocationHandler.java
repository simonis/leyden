import java.nio.file.Path;

import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;

@TargetClass(className="com.sun.tools.javac.file.Locations", innerClass="SystemModulesLocationHandler")
final class Target_com_sun_tools_javac_file_Locations_SystemModulesLocationHandler {

    @Substitute
    private boolean isCurrentPlatform(Path p) {
        System.out.println("Dr. Substitutor was here :)");
        new Exception().printStackTrace();
        return false;
    }
}
