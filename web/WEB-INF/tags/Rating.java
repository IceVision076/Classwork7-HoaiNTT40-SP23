
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author quang
 */
public class Rating extends SimpleTagSupport {

    private int min;
    private int max;
    private int value;

    
    

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();

        try {
            // TODO: insert code to write html before writing the body content.
            // e.g.:
            //
            // out.println("<strong>" + attribute_1 + "</strong>");
            // out.println("    <blockquote>");
            int range = max - min + 1;
            int filledStars = (value - min) + 1;
            int emptyStars = range - filledStars;
            String filledStarUrl = "/images/filled_star.png";
            String emptyStarUrl = "/images/empty_star.png";
            if (value < min) {
                filledStars = 0;
                emptyStars = range;
            } else if (value > max) {
                filledStars = range;
                emptyStars = 0;
            }

            for (int i = 1; i <= filledStars; i++) {
                out.print("<img src=\"" + filledStarUrl + "\" alt=\"Filled Star\" />");
            }

            for (int i = 1; i <= emptyStars; i++) {
                out.print("<img src=\"" + emptyStarUrl + "\" alt=\"Empty Star\" />");
            }
            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

            // TODO: insert code to write html after writing the body content.
            // e.g.:
            //
            // out.println("    </blockquote>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in Rating tag", ex);
        }
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
