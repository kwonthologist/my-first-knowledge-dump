---
name: "🚀 Pull Request"
about: "Use this template when submitting code changes for review"
title: "[FEATURE|FIX|DOCS|REFACTOR|TEST] Brief description"
labels: ""
assignees: ""

---

# Pull Request Template

## Description

Please include a summary of the changes and the related issue.  
Explain the motivation behind the changes if necessary.

Fixes # (issue number)

---

## Type of Change

- [ ] Bug fix
- [ ] New feature
- [ ] Documentation update
- [ ] Refactoring
- [ ] Tests
- [ ] CI/CD pipeline update

---

## Checklist

### Code Quality

- [ ] Code follows project style guidelines (ESLint/Prettier, Checkstyle)
- [ ] No new code smells or security vulnerabilities introduced (SonarQube scan passed)
- [ ] Self-reviewed the code changes

### Testing

- [ ] Added or updated unit tests (Frontend & Backend)
- [ ] Added or updated integration tests
- [ ] E2E tests updated or added (if applicable)
- [ ] All tests passing locally and in CI pipeline

### Documentation

- [ ] Updated documentation (README, `/docs` folder, architecture, or API docs)
- [ ] Added or updated inline code comments where necessary

### Git

- [ ] Branch up to date with `dev` branch
- [ ] PR targets the correct branch (`dev` or `main` as appropriate)
- [ ] PR title follows conventions (e.g., `[FEATURE] Add user login`)

---

## Deployment Notes

- [ ] Database migrations included and tested (Flyway)
- [ ] CI/CD pipeline updated if relevant
- [ ] Docker image builds successfully and tested locally

---

## Security & Monitoring

- [ ] Input validations included and verified
- [ ] No secrets or sensitive info committed
- [ ] Logs and monitoring hooks tested or updated

---

## Additional Notes

Please provide any other relevant information or context here.

---

### Reviewer Checklist (for maintainers)

- [ ] Code is clean and understandable
- [ ] Tests cover new and changed functionality adequately
- [ ] No breaking changes without clear justification
- [ ] Documentation is clear and complete
- [ ] Deployment steps verified if applicable

---

Thank you for your contribution! 🎉
