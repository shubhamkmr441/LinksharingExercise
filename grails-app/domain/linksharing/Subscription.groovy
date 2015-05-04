package linksharing

class Subscription {
    Topic topic
    User user
    Date datecreated

    enum Seriousness {
        Serious, very_Serious, Casual
    }

    static constraints = {


    }
}
