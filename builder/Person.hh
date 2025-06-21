#pragma once

#include <chrono>
#include <string>
#include <memory>
#include <stdexcept>

struct FullName {
  std::string name;
  std::string sername;
};

class Person {
  std::chrono::year_month_day birth;
  FullName name;
  double salary;

  class Builder {
    std::unique_ptr<Person> person;

    public:
    Builder(): person{ std::make_unique<Person>() } {}

    Builder& birth(unsigned d, unsigned m, int y) {
      using namespace std::chrono;

      std::chrono::year_month_day date{ year{ y }, month{ m }, day{ d } };
      if (!date.ok()) throw std::invalid_argument{ "Invalid date" };
      person->birth = std::move(date);
      return *this;
    }

    Builder& name(const std::string& name, const std::string& sername) {
      person->name = { name, sername };
      return *this;
    }

    Builder& salary(double salary) {
      person->salary = salary;
      return *this;
    }

    std::unique_ptr<Person> build() {
      return std::move(person);
    }
  };

  public:  

  static Builder builder() { return Builder(); }
};
