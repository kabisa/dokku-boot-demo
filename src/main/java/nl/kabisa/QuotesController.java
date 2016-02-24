package nl.kabisa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuotesController {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public QuotesController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String getRandomQuote() {
        return jdbcTemplate.queryForObject("select text from quotes ORDER BY random() LIMIT 1;", String.class);
    }
}
