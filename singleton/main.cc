#include <iostream>

#include "Database.hh"

int main(const int argc, const char* argv[]) {
  Database::getInstance();
  Database::getInstance();
  return 0;
}
