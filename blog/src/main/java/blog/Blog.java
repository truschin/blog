package blog;

import java.util.Date;
import java.util.UUID;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@JsonIgnoreProperties({ "_id" }) 
public class Blog {
 
    private String id = UUID.randomUUID().toString();
 
    @NotBlank
    private String title;
 
    @URL
    @NotBlank
    private String url;
 
    private final Date publishedOn = new Date();
 
    public Blog() {
    }
 
    public Blog(String title, String url) {
        super();
        this.title = title;
        this.url = url;
    }
 
    public String getId() {
        return id;
    }
 
    public String getTitle() {
        return title;
    }
 
    public String getUrl() {
        return url;
    }
 
    public Date getPublishedOn() {
        return publishedOn;
    }
}