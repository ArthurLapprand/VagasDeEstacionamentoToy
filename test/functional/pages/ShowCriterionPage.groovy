package pages

import geb.Page

/**
 * Created by lapp on 31/05/2016.
 */
class ShowCriterionPage extends Page {
    static url = "criterion/index"

    static at = {
        title ==~ /Criterion List/
    }
}
