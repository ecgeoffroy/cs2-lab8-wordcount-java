Try using a TreeMap instead of a HashMap. Does this make any difference?
No, there was no difference when using TreeMap instead of a HashMap.


What happens if you invoke countWords multiple times for different String iterators?
Calling the method countWords with various iterators will establish new keys and value pairs in the map.
If the string is not already a key, a new key will be formed with a default value of 1; however if
the string matches a key in the map, its value will be incremented by 1. 

What crucial role does the Iterator abstraction play in making WordCounter testable?
It allows testing methods without needing input. We can create many various types of lists and still be able to iterate through the same way.
It also allows us to control our test data and ensure that our assertions are correct.