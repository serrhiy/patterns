#include <iostream>
#include "Person.hh"

int main(const int argc, const char* argv[]) {
  const auto person = Person::builder().name("Some", "Name").salary(1500).build();
  return 0;
}
