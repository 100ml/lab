import anno.Header;
import anno.Strategy;

import javax.annotation.Nonnull;
import java.lang.reflect.TypeVariable;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class CSVUtil<T> {
    private Class tClass;
    private Header header;

    @Nonnull
    public List<T> convert(@Nonnull String csvStr) {
        if (header.strategy() == Strategy.ORDER) {

            return null;
        } else {


            return null;
        }
    }

    public CSVUtil() {
        init();
        check();
    }

    @Nonnull
    public String reverse(@Nonnull List<T> list) {

        return null;
    }

    private void init() {
        TypeVariable<? extends Class<? extends CSVUtil>>[] typeVariables = this.getClass().getTypeParameters();
        tClass = typeVariables[0].getClass();
        header = getHeaderAnnotation(tClass);
    }

    private void check() {
        checkNotNull(tClass, "type parameter should not by empty");
        checkNotNull(header, "annotation should be present on type parameter class");
    }

    private Header getHeaderAnnotation(Class<T> tClass) {
        if (tClass.isAnnotationPresent(Header.class)) {
            return tClass.getClass().getAnnotation(Header.class);
        } else return null;
    }
}
