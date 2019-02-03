# project
Database 
Πώς λειτουργεί:
Εμφανίζεται το μενού όπου ο χρήστης δίνει την επιλογή που θέλει πληκτρολογώντας τον αριθμό .
Το μενού δίνει στον χρήστη 6 επιλογές οι οποίες είναι ( κατά σειρά εμφάνισης ) :
    1) Η δημιουργία της μίας βάσης 
    2) Η εισαγωγή περισσότερων δεδομέμων σε μία από τις βάσεις 
    3) Η αλλαγή δεδομένων
    4) Η διαγραφή δεδομένων 
    5) Η εκτύπωση δεδομένων
    6) Η έξοδος

Αναλυτικότερα, οι παραπάνω κλάσεις - επιλογές, λειτουργούν ως εξής:
1) Στη δημιουργία καλείται η input όπου αρχικά ζητάει από τον χρήστη την ειγαγωγή των κατηγοριών της βάσης που θέλουμε να δημιουργήσουμε
και με το -1 σταματάμε την εκχώρηση κατηγοριών. Μετά εισάγουμε δεδομένα για καθε κατηγορία ( ανά γραμμή ) και πατάμε enter. Όταν 
τελειώσουμε και με την εισαγωγή δεδομένων πατάμε -1 και εμφανίζεται πάλι το μενού. Εάν θέλουμε να δημιουργήσουμε κι άλλη βάση ξαναπατάμε 
το 1 και επαναλμβάνεται η διαδικασία.

2) Εδώ σε περίπτωση που έχουμε παραπάνω απο μία βάση διαλέγουμε τη βάση που θέλουμε να καταχωρήσουμε επιπλέον δεδομένα πατώντας το 1 αν
θέλουμε την πρώτη βάση το 2 την δεύτερη κ.ο.κ. Στην βάση που επιλέξαμε εισάγουμε νέα στοιχεία, δηλαδή νέες γραμμές, όπως ακριβώς και στην δημιουργία της βάσης.

3) Πάλι σε περίπτωση που έχουμε παραπάνω απο μία βάση διαλέγουμε τη βάση της οποίας θέλουμε να τροποποιήσουμε τα δεδομένα, πατώντας το 1 για την πρώτη βάση το 2 για τη δεύτερη κ.ο.κ. Στην αλλαγή έχουμε τη δυνατότητα να αλλάξουμε το όνομα μίας κατηγορίας ή το όνομα ενός αρχείου πληκτρολογώντας αντίστοιχα 1 ή 2 . Αν πατήσουμε 1 τότε πληκτρολογούμε το όνομα της κατηγορίας που θέλουμε να αλλάξουμε και δίνουμε το νέο όνομα κατηγορίας. Αν πατήσουμε 2 τότε πληκτρολογούμε το όνομα της στήλης-κατηγορίας στην οποία βρίσκεται το στοιχείο που θέλουμε να αλλάξουμε και μετά πληκτρολογούμε το όνομα του στοιχείου που θέλουμε να αλλάξουμε . Τέλος, δίνουμε το όνομα του νέου στοιχείου.

4) Πάλι σε περίπτωση που έχουμε παραπάνω απο μία βάση διαλέγουμε τη βάση, από την οποία επιθυμούμε να διαγράψουμε δεδομένα, πατώντας το 1 αν θέλουμε την πρώτη βάση το 2 την δεύτερη κ.ο.κ. Έχουμε 3 επιλογές: 1) διαγραφή στήλης, 2) διαγραφή γραμμής, 3) διαγραφή στοιχείου. Λειτουργεί με τον ίδιο τρόπο που λειτουργεί και η κλάση change ζητώντας δηλαδή κάθε φορά το όνομα της στήλης, το νούμερο της γραμμής και το στοιχείο.

5) Για κάθε βάση που έχουμε δημιουργήσει μπορούμε να δούμε όλα τα δεδομένα της βάσης μας πατώντας το 1 , μία συγκεκριμένη γραμμή πατώντας το 2 και έπειτα δίνοντας τον αριθμό γραμμής και μία συγκεκριμένη στήλη πατώντας το 3 και δίνοντας το όνομα της στήλης .

6) Πατώντας το 6 κλέινει το πρόγραμμα.