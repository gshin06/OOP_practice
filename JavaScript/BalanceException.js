export default class BalanceException extends Error {
    constructor(message) {
        super(message);
        this.message = message;
    }
}