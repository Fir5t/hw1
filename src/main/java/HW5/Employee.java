package HW5;

public class Employee {

        private String name;
        private String position;
        private String email;
        private String tel;
        private Integer fee;
        private Integer age;

        public Employee(String name, String position, String email, String tel, Integer fee, Integer age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.tel = tel;
            this.fee = fee;
            this.age = age;
        }
        // Этот метод выводит информацию о сотруднике
        public void info(){
            System.out.println(this.name + " | " + this.position + " | " + this.email + " | " + this.tel + " | "  + this.fee + " | " + this.age);
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public Integer getFee() {
            return fee;
        }

        public void setFee(Integer fee) {
            this.fee = fee;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
