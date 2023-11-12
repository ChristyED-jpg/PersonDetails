package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        // create a `counter`
      Integer counter = 0;
        // while `counter` is less than length of array
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop

        while (personArray.length > counter){
         Person currentPerson = personArray[counter];
           String Representative = currentPerson.toString();
           result += Representative;
            counter++;
        }


        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
         Integer count = 0;
        // identify terminal condition
          if (count < personArray.length) {
              // identify increment
             count ++;
              // use the above clauses to declare for-loop signature
              // begin loop
              // use `counter` to identify the `current Person` in the array
              // get `string Representation` of `currentPerson`
              // append `stringRepresentation` to `result` variable
              // end loop
              for( int i = 0 ; i < personArray.length; i++){
                  String Representative = personArray[i].toString();
                  result += Representative;
              }
          }
              return result;

    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        Person []
        // identify array's variable-name
            personArray;
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
         for ( Person person : this.personArray){
             String Representative =  person.toString();
                result += Representative;
         }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
