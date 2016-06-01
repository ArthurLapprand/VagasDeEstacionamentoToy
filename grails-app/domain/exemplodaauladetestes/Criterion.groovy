package exemplodaauladetestes

class Criterion {
    String description
    static constraints = {
        description nullable: false, blank: false, unique: true
    }
}
